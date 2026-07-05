package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dq3  reason: default package */
/* loaded from: classes.dex */
public final class dq3 implements dv2 {
    public final /* synthetic */ xn6 a;

    public dq3(EmojiCompatInitializer emojiCompatInitializer, xn6 xn6Var) {
        this.a = xn6Var;
    }

    @Override // defpackage.dv2
    public final void Q(un6 un6Var) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = qy1.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new t51(1), 500L);
        this.a.f(this);
    }
}
