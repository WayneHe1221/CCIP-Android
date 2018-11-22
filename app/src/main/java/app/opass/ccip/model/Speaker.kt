package app.opass.ccip.model

import android.content.Context
import app.opass.ccip.util.LocaleUtil
import java.util.*

data class Speaker(
    val id: String,
    val avatar: String,
    val zh: Zh_,
    val en: En_
) {
    fun getSpeakerDetail(context: Context): SpekaerDetail {
        return if (LocaleUtil.getCurrentLocale(context).language == Locale("zh").language) {
            zh
        } else {
            en
        }
    }
}