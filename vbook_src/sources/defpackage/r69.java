package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r69  reason: default package */
/* loaded from: classes.dex */
public final class r69 implements un6 {
    public static final r69 E = new r69();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final xn6 f = new xn6(this, true);
    public final e09 C = new e09(this, 1);
    public final k57 D = new k57(this, 3);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.d(jn6.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            handler.getClass();
            handler.removeCallbacks(this.C);
        }
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return this.f;
    }
}
