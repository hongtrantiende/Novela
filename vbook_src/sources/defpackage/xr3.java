package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xr3  reason: default package */
/* loaded from: classes.dex */
public final class xr3 extends zp3 implements Runnable {
    public final WeakReference a;

    public xr3(wv wvVar) {
        this.a = new WeakReference(wvVar);
    }

    @Override // defpackage.zp3
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        yr3.a((EditText) this.a.get(), 1);
    }
}
