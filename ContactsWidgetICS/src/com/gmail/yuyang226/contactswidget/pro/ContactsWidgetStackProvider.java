/**
 * 
 */
package com.gmail.yuyang226.contactswidget.pro;

import android.content.Context;
import android.graphics.Rect;

/**
 * @author Toby Yu(yuyang226@gmail.com)
 *
 */
public class ContactsWidgetStackProvider extends ContactsWidgetProvider {

	/**
	 * 
	 */
	public ContactsWidgetStackProvider() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.gmail.yuyang226.contactswidget.ContactsWidgetProvider#getWidgetEntryLayoutId()
	 */
	@Override
	protected int getWidgetEntryLayoutId() {
		return R.layout.contact_entry_large;
	}
	
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		super.onDeleted(context, appWidgetIds);
		for (int appWidgetId : appWidgetIds) {
			ContactsWidgetStackConfigurationActivity.deleteShowName(context, appWidgetId);
			ContactsWidgetStackConfigurationActivity.deleteLoopContacts(context, appWidgetId);
		}
	}

	@Override
	protected Rect getImageSize() {
		return IMAGE_SIZE_LARGE_RECT;
	}
	
	
	
}
