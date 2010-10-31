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
import junit.framework.TestCase;

/**
 *
 * @author Tomas Herout
 */
public class EcoreUtilTest extends TestCase {

    private EcoreUtil ecoreUtil;
    private String random = "shfasleifhaesf";

    public EcoreUtilTest() throws Exception {
        ecoreUtil = new EcoreUtil("test.ecore");
    }

    public void testAddClassAndAttribute() {
        String className1 = random.toLowerCase();
        String attName1 = random.toUpperCase();
        String className2 = attName1;
        String attName2 = className1;

        // pridani tridy
        assertNull(ecoreUtil.getClassByName(className1));
        try {
            ecoreUtil.addClass(className1);
        } catch (IOException ex) {
            assert(false);
        }
        assertNotNull(ecoreUtil.getClassByName(className1));

        //doublovani pridavani tridy
        try {
            ecoreUtil.addClass(className1);
            assert(false);
        } catch (IOException ex) {
            assert(true);
        }

        
        // pridani atributu
        assertNull(ecoreUtil.getAttributeType(className1, attName1));
        try {
            ecoreUtil.addAttribute(className1, attName1, "string");
        } catch (IOException ex) {
            assert (false);
        }
        assertEquals("EString", ecoreUtil.getAttributeType(className1, attName1));

        //doublovani pridani atributu tridy
        try {
            ecoreUtil.addAttribute(className1, attName1, "string");
            assert(false);
        } catch (IOException ex) {
            assert (true);
        }

        // prejmenovani tridy
        assertNull(ecoreUtil.getClassByName(className2));
        try {
            ecoreUtil.renameClass(className1, className2);
        } catch (IOException ex) {
            assert (false);
        }
        assertNull(ecoreUtil.getClassByName(className1));
        assertNotNull(ecoreUtil.getClassByName(className2));

        //doublovani prejmenovani tridy
        try {
            ecoreUtil.renameClass(className1, className2);
            assert(false);
        } catch (IOException ex) {
            assert (true);
        }


        // prejmenovani atributu
        assertNull(ecoreUtil.getAttributeType(className2, attName2));
        try {
            ecoreUtil.renameAttribute(className2, attName1, attName2);
        } catch (IOException ex) {
            assert(false);
        }
        assertNull(ecoreUtil.getAttributeType(className2, attName1));
        assertNotNull(ecoreUtil.getAttributeType(className2, attName2));

        //doublovani prejmenovani atributu
        try {
            ecoreUtil.renameAttribute(className2, attName1, attName2);
            assert(false);
        } catch (IOException ex) {
            assert(true);
        }

        // smazani atributu
        try {
            ecoreUtil.delAttribute(className2, attName2);
        } catch (IOException ex) {
            assert(false);
        }

        try {
            ecoreUtil.delAttribute(className2, attName2);
            assert(false);
        } catch (IOException ex) {
            assert(true);
        }

        assertNull(ecoreUtil.getAttributeType(className2, attName2));
            // smazani tridy
        try {
            ecoreUtil.delClass(className2);
        } catch (IOException ex) {
            assert(false);
        }
        assertNull(ecoreUtil.getClassByName(className2));

        //doublovani smazani tridy
         try {
            ecoreUtil.delClass(className2);
            assert(false);
        } catch (IOException ex) {
            assert(true);
        }

    }
}
