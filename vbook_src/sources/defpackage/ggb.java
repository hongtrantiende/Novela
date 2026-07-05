package defpackage;

import android.os.Handler;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ggb  reason: default package */
/* loaded from: classes.dex */
public final class ggb {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public ggb(Handler handler) {
        this.a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fgb c() {
        fgb fgbVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    fgbVar = new Object();
                } else {
                    fgbVar = (fgb) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fgbVar;
    }

    public final fgb a(int i) {
        fgb c = c();
        c.a = this.a.obtainMessage(i);
        return c;
    }

    public final fgb b(int i, Object obj) {
        fgb c = c();
        c.a = this.a.obtainMessage(i, obj);
        return c;
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void e(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.a.removeMessages(i);
    }

    public final void f(int i) {
        this.a.sendEmptyMessage(i);
    }
}
