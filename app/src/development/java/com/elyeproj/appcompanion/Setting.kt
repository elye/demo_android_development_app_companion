import android.content.Context
import com.elyeproj.appcompanion.DefaultSetting.MY_DEFAULT

object Setting {
    private const val MY_KEY = "MyKey"
    private const val MY_PREFERENCE = "InternalPreference"

    fun getSetting(context: Context): String {
        val preference = context.getSharedPreferences(MY_PREFERENCE, Context.MODE_PRIVATE)
        return preference.getString(MY_KEY, MY_DEFAULT) ?: MY_DEFAULT
    }

    fun setSetting(context: Context, value: String) {
        val preference = context.getSharedPreferences(Setting.MY_PREFERENCE, Context.MODE_PRIVATE)
        preference.edit().putString(Setting.MY_KEY, value).apply()
    }
}
