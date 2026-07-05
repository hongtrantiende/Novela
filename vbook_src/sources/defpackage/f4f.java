package defpackage;

import android.os.Looper;
import android.os.SystemClock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f4f  reason: default package */
/* loaded from: classes.dex */
public final class f4f extends fne {
    public final hvc C;
    public ovd c;
    public boolean d;
    public final g99 e;
    public final ju0 f;

    /* JADX WARN: Type inference failed for: r4v3, types: [ju0, java.lang.Object] */
    public f4f(lte lteVar) {
        super(lteVar);
        this.d = true;
        this.e = new g99(this, 23);
        ?? obj = new Object();
        obj.d = this;
        lte lteVar2 = (lte) this.a;
        obj.c = new v3f(obj, lteVar2, 0);
        lteVar2.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.a = elapsedRealtime;
        obj.b = elapsedRealtime;
        this.f = obj;
        this.C = new hvc(this, 22);
    }

    @Override // defpackage.fne
    public final boolean a0() {
        return false;
    }

    public final void b0() {
        W();
        if (this.c == null) {
            this.c = new ovd(Looper.getMainLooper(), 2);
        }
    }
}
