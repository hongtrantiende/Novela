package defpackage;

import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c50  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c50(q04 q04Var, int i, boolean z) {
        this.a = 2;
        this.c = q04Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((d50) obj).b.onAudioFocusChange(i2);
                return;
            case 1:
                c04 c04Var = ((b60) obj).b;
                String str = a2d.a;
                t6f t6fVar = c04Var.a.B;
                b04 b04Var = new b04(i2);
                t6fVar.getClass();
                if (Looper.myLooper() == ((ggb) t6fVar.d).a.getLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                t6fVar.b++;
                t6fVar.k(new b9(10, t6fVar, b04Var));
                Integer num = (Integer) t6fVar.f;
                t6fVar.o(Integer.valueOf(i2));
                return;
            default:
                q04 q04Var = (q04) obj;
                ms2 ms2Var = q04Var.S;
                int i3 = q04Var.a[i2].a.b;
                ms2Var.N(ms2Var.M(), 1033, new gs2(4));
                return;
        }
    }

    public /* synthetic */ c50(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
