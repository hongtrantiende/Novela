package defpackage;

import java.util.ArrayList;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ekf  reason: default package */
/* loaded from: classes.dex */
public final class ekf extends uyd {
    public static final dkf L = new dkf();
    public static final dff M = new dff("closed");
    public final ArrayList I;
    public String J;
    public tef K;

    public ekf() {
        super(L);
        this.I = new ArrayList();
        this.K = xef.a;
    }

    @Override // defpackage.uyd
    public final void G() {
        qef qefVar = new qef();
        g1(qefVar);
        this.I.add(qefVar);
    }

    @Override // defpackage.uyd
    public final void Q() {
        ArrayList arrayList = this.I;
        if (!arrayList.isEmpty() && this.J == null) {
            if (b1() instanceof qef) {
                arrayList.remove(arrayList.size() - 1);
                return;
            } else {
                vm1.d();
                return;
            }
        }
        vm1.d();
    }

    @Override // defpackage.uyd
    public final void S() {
        zef zefVar = new zef();
        g1(zefVar);
        this.I.add(zefVar);
    }

    @Override // defpackage.uyd
    public final void V() {
        ArrayList arrayList = this.I;
        if (!arrayList.isEmpty() && this.J == null) {
            if (b1() instanceof zef) {
                arrayList.remove(arrayList.size() - 1);
                return;
            } else {
                vm1.d();
                return;
            }
        }
        vm1.d();
    }

    public final tef b1() {
        ArrayList arrayList = this.I;
        return (tef) arrayList.get(arrayList.size() - 1);
    }

    @Override // defpackage.uyd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.I;
        if (arrayList.isEmpty()) {
            arrayList.add(M);
        } else {
            fb4.k("Incomplete document");
        }
    }

    @Override // defpackage.uyd
    public final void g0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.I.isEmpty() && this.J == null) {
            if (b1() instanceof zef) {
                this.J = str;
                return;
            } else {
                vs.k("Please begin an object before writing a name.");
                return;
            }
        }
        vs.k("Did not expect a name");
    }

    public final void g1(tef tefVar) {
        if (this.J != null) {
            if (!(tefVar instanceof xef) || this.F) {
                ((zef) b1()).a.put(this.J, tefVar);
            }
            this.J = null;
        } else if (this.I.isEmpty()) {
            this.K = tefVar;
        } else {
            tef b1 = b1();
            if (b1 instanceof qef) {
                ((qef) b1).a.add(tefVar);
            } else {
                vm1.d();
            }
        }
    }

    @Override // defpackage.uyd
    public final void j0(String str) {
        if (str == null) {
            g1(xef.a);
        } else {
            g1(new dff(str));
        }
    }

    @Override // defpackage.uyd
    public final void m0(boolean z) {
        g1(new dff(Boolean.valueOf(z)));
    }

    @Override // defpackage.uyd
    public final void p0(Number number) {
        if (this.D != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                vs.m("JSON forbids NaN and infinities: ".concat(number.toString()));
                return;
            }
        }
        g1(new dff(number));
    }

    @Override // defpackage.uyd
    public final void y0() {
        g1(xef.a);
    }

    @Override // defpackage.uyd, java.io.Flushable
    public final void flush() {
    }
}
