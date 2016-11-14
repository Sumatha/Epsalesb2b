/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 11, 2016 12:29:59 PM                    ---
 * ----------------------------------------------------------------
 */
package com.epsalesb2bcommerceservices.jalo;

import com.epsalesb2bcommerceservices.constants.Epsalesb2bcommerceservicesConstants;
import com.epsalesb2bcommerceservices.jalo.ProductQuantityThresholdFreeGiftPromotion;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Epsalesb2bcommerceservicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEpsalesb2bcommerceservicesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Epsalesb2bcommerceservicesConstants.TC.PRODUCTQUANTITYTHRESHOLDFREEGIFTPROMOTION );
			return (ProductQuantityThresholdFreeGiftPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductQuantityThresholdFreeGiftPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final Map attributeValues)
	{
		return createProductQuantityThresholdFreeGiftPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Epsalesb2bcommerceservicesConstants.EXTENSIONNAME;
	}
	
}
