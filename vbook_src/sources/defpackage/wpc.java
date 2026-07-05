package defpackage;

import android.content.Context;
import android.content.Intent;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wpc  reason: default package */
/* loaded from: classes.dex */
public final class wpc {
    public final Context a;

    public wpc(Context context) {
        this.a = context;
    }

    public final void a(int i, int i2, String str) {
        str.getClass();
        Context context = this.a;
        Intent intent = new Intent(context, AndroidTextToSpeechService.class);
        intent.setAction("com.reader.action.tts.START");
        intent.putExtra("ARGS_BOOK_ID", str);
        intent.putExtra("ARGS_CHAPTER_INDEX", i);
        intent.putExtra("ARGS_CHAR_INDEX", i2);
        eze.s(context, intent);
    }

    public final void b() {
        Context context = this.a;
        Intent intent = new Intent(context, AndroidTextToSpeechService.class);
        intent.setAction("com.reader.action.tts.RESUME_LAST_SESSION");
        eze.s(context, intent);
    }
}
