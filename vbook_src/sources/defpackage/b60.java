package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b60  reason: default package */
/* loaded from: classes.dex */
public final class b60 {
    public final Handler a;
    public final c04 b;

    public b60(Handler handler, c04 c04Var, int i) {
        switch (i) {
            case 1:
                if (c04Var != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.a = handler;
                this.b = c04Var;
                return;
            default:
                this.a = handler;
                this.b = c04Var;
                return;
        }
    }

    public void a(ar2 ar2Var) {
        synchronized (ar2Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new b9(5, this, ar2Var));
        }
    }

    public void b(uad uadVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new ex2(29, this, uadVar));
        }
    }
}
