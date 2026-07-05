package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e50  reason: default package */
/* loaded from: classes.dex */
public final class e50 implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public e50(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        this.a = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 2782386) {
            this.b.onAudioFocusChange(message.arg1);
            return true;
        }
        return false;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Handler handler = this.a;
        handler.sendMessage(Message.obtain(handler, 2782386, i, 0));
    }
}
