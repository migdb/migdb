package migdb.dsl.ops.formatting;

import migdb.dsl.ops.services.OpsGrammarAccess;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class OpsFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		OpsGrammarAccess f = (OpsGrammarAccess) getGrammarAccess();

		formatKeywords(c, f);
		formatOperations(c, f);
		formatComment(c, f);
	}

	/**
	 * Formats special keywords.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the OpsGrammarAccess.
	 */
	private void formatKeywords(FormattingConfig c, OpsGrammarAccess f) {
		setNoSpace(f, c, Style.AROUND, ".", "[", "..");
		setNoSpace(f, c, Style.BEFORE, ";", ",", "}", "]");
		setNoSpace(f, c, Style.AFTER, "{");
		setSpace(f, c, Style.AFTER, ",");
		setSpace(f, c, Style.AROUND, ":", "->", "/", "<:");
	}

	/**
	 * Formats operations' rule.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the OpsGrammarAccess.
	 */
	private void formatOperations(FormattingConfig c, OpsGrammarAccess f) {
		setLineWrap(c, Style.AFTER, 1, 1, 2, f.getOperationsAccess().getSemicolonKeyword_1_0());
		
		setLineWrap(c, Style.AFTER, 1, 1, 2,
				f.getRenameEntityRule(),
				f.getAddClassRule(),
				f.getRemoveEntityRule(),
				f.getAddPropertyRule(),
				f.getRenamePropertyRule(),
				f.getRemovePropertyRule(),
				f.getMovePropertyRule(),
				f.getPullUpPropertyRule(),
				f.getPushDownPropertyRule(),
				f.getAddParentRule(),
				f.getRemoveParentRule(),
				f.getExtractClassRule(),
				f.getExtractSubClassRule(),
				f.getExtractSuperClassRule());
	}

	/**
	 * Formats comment rule.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the OpsGrammarAccess.
	 */
	private void formatComment(FormattingConfig c, OpsGrammarAccess f) {
		setLineWrap(c, Style.BEFORE, 0, 1, 2, f.getSL_COMMENTRule());
		setLineWrap(c, Style.BEFORE, 0, 1, 2, f.getML_COMMENTRule());
		setLineWrap(c, Style.AFTER, 0, 1, 1, f.getML_COMMENTRule());
	}
	
	
	/**
	 * Finds element by given string name and formats it with no space.
	 * 
	 * @param f An instance of the AbstractGrammarElementFinder.
	 * @param c An instance of the FormattingConfig.
	 * @param keyword String keyword to be formated.
	 * @param style Style of a formatting.
	 */
	private void setNoSpace(AbstractGrammarElementFinder f,
			FormattingConfig c, Style style, String... keywords) {
		for (Keyword key : f.findKeywords(keywords))
			setStyle(c.setNoSpace(), key, style);
	}

	/**
	 * Finds element by given string name and formats it with space.
	 * 
	 * @param f An instance of the AbstractGrammarElementFinder.
	 * @param c An instance of the FormattingConfig.
	 * @param keyword String keyword to be formated.
	 * @param style Style of a formatting.
	 */
	private void setSpace(AbstractGrammarElementFinder f,
			FormattingConfig c, Style style, String... keywords) {
		for (Keyword key : f.findKeywords(keywords))
			setStyle(c.setSpace(" "), key, style);
	}
	
	/**
	 * Linewraps multiple EObjects by given values.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param style Style of a formatting.
	 * @param minWraps Mininum value of wraps.
	 * @param defaultWraps Default value of wraps.
	 * @param maxWraps Maximum value of wraps.
	 * @param key Instances of the EObject to be formatted.
	 */
	private void setLineWrap(FormattingConfig c, Style style,
			int minWraps, int defaultWraps, int maxWraps, EObject... key) {
		for(EObject obj : key)
			setStyle(c.setLinewrap(minWraps, defaultWraps, maxWraps), obj, style);
	}
	
	/**
	 * Applies selected Style to given ElementLocator
	 * @param element 
	 * @param key
	 * @param style
	 */
	private void setStyle(ElementLocator element, EObject key, Style style) {
		if (style == Style.AFTER) {
			element.after(key);
		} else if (style == Style.BEFORE) {
			element.before(key);
		} else {
			element.around(key);
		}
	}
	
	private static enum Style {
		BEFORE, AROUND, AFTER
	}
}
