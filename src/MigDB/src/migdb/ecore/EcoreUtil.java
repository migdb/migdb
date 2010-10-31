/*
 * The MIT License
 *
 * Copyright (c) 2010 MigDB team [https://rabbit.felk.cvut.cz/trac/migdb]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package migdb.ecore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 *
 * @author Tomáš Herout
 */
public class EcoreUtil {

    // umozni vytvaret tridy, atributy, reference, ...
    EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
    // umozni vytvaret ruzne typy
    EcorePackage ecorePackage = EcorePackage.eINSTANCE;
    // reference na model
    Resource resource;
    // reference na balicek
    EPackage ePackage;

    public EcoreUtil(String fileName) throws IOException {
        EcoreResourceFactoryImpl erfi = new EcoreResourceFactoryImpl();

        resource = erfi.createResource(URI.createFileURI(fileName));
        resource.load(null);

        ePackage = (EPackage) resource.getContents().get(0);
    }

    public void save() throws IOException {
        resource.save(null);
    }

    public void addClass(String className) throws IOException {
        if( getClassByName(className) != null) {
            throw new IOException("Trida " + className + "jiz existuje");
        }

        EClass newClass = ecoreFactory.createEClass();
        newClass.setName(className);
        ePackage.getEClassifiers().add(newClass);
    }

    public void addAttribute(String className, String attName, String attType) throws IOException {
        
        if( getAttributeByName(className, attName) != null){
            throw new IOException("Atribut " + attName + " jiz v tride "+className + " existuje");
        }
        EAttribute newAttribute = ecoreFactory.createEAttribute();
        newAttribute.setName(attName);
        newAttribute.setEType(getEType(attType));

        getClassByName(className).getEStructuralFeatures().add(newAttribute);
    }

    public void renameClass(String oldClassName, String newClassName) throws IOException {
        if(getClassByName(newClassName) != null){
            throw new IOException("Trida s jmenem " + newClassName + " jiz existuje");
        }
        EClass eClass = getClassByName(oldClassName);
        eClass.setName(newClassName);
    }

    public void renameAttribute(String className, String oldAttName, String newAttName) throws IOException {
        if( getAttributeByName(className, newAttName) != null){
            throw new IOException("Atribut " + newAttName + " jiz v tride " +className + " existuje");
        }
        EAttribute attribute = getAttributeByName(className, oldAttName);
        attribute.setName(newAttName);
    }

    public void delClass(String className) throws IOException {
        if(getClassByName(className) == null) {
            throw new IOException("Trida s zadanym jmenem " + className + " neexistuje");
        }
        ePackage.getEClassifiers().remove(getClassByName(className));
    }

    public void delAttribute(String className, String attName) throws IOException {
        if( getAttributeByName(className, attName) == null){
            throw new IOException("Atribut " + attName + " v tride "+className + " nexistuje");
        }
        EAttribute attribute = getAttributeByName(className, attName);
        EClass eClass = getClassByName(className);
        eClass.getEStructuralFeatures().remove(attribute);
    }

    public Map<String, String> getClassAttributes(String className) {
        Map<String, String> attributes = new HashMap<String, String>();

        for (EAttribute attribute : getClassByName(className).getEAllAttributes()) {
            attributes.put(attribute.getName(), attribute.getEType().getName());
        }

        return attributes;
    }

    public String getAttributeType(String className, String attName) {
        EAttribute eAttribute = getAttributeByName(className, attName);

        if (eAttribute != null) {
            return eAttribute.getEType().getName();
        } else {
            return null;
        }
    }

    EClass getClassByName(String className) {

        for (EClassifier eClassifier : ePackage.getEClassifiers()) {
            EClass eClass = (EClass) eClassifier;
            if (eClass.getName().equals(className)) {
                return eClass;
            }
        }

        return null;
    }

    private EAttribute getAttributeByName(String className, String attName) {
        EList<EAttribute> attributesList = null;
        try{
        attributesList = getClassByName(className).getEAllAttributes();
        } catch (NullPointerException ex){
            return null;
        }

        for (EAttribute attribute : attributesList) {
                if (attribute.getName().equals(attName)) {
                    return attribute;
                }
        }
        return null;
    }

    private EClassifier getEType(String typeName) {
        if (typeName.equals("string")) {
            return ecorePackage.getEString();
        } else if (typeName.equals("int")) {
            return ecorePackage.getEInt();
        }
        return null;
    }
}
