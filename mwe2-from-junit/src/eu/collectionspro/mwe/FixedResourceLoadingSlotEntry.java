package eu.collectionspro.mwe;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.mwe.ResourceLoadingSlotEntry;

public class FixedResourceLoadingSlotEntry extends ResourceLoadingSlotEntry {

	private Set<Pattern> fixedUris = new HashSet<Pattern>();

	@Override
	public void addUri(String uri) {
		this.fixedUris.add(Pattern.compile(uri));
	}

	@Override
	protected boolean isMatch(Resource resource) {
		if (fixedUris.isEmpty())
			return true;
		for (Pattern uriPattern : fixedUris) {
			if (uriPattern.matcher(resource.getURI().toString()).find())
				return true;
		}
		return false;
	}

}
