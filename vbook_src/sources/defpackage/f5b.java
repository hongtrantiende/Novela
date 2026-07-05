package defpackage;

import android.os.SystemClock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f5b  reason: default package */
/* loaded from: classes.dex */
public final class f5b {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ kn e;

    public f5b(kn knVar, int i) {
        this.e = knVar;
        this.a = i;
    }

    public final void a() {
        kn knVar = this.e;
        ggb ggbVar = (ggb) knVar.C;
        i04 i04Var = (i04) knVar.b;
        int s = i04Var.s();
        if (i04Var.q() && i04Var.r() != 1 && i04Var.r() != 4 && s != 0 && s != 1) {
            ((xfb) knVar.e).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.c;
            int i = this.a;
            if (z && this.b == s) {
                if (elapsedRealtime - this.d >= i) {
                    ((c04) knVar.d).a.S(new pz3(2, new g5b(4, i), 1003));
                    return;
                }
                return;
            }
            this.c = true;
            this.d = elapsedRealtime;
            this.b = s;
            ggbVar.e(4);
            ggbVar.a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (this.c) {
            ggbVar.e(4);
        }
        this.c = false;
    }
}
