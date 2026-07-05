package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioFocusRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.view.autofill.AutofillId;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vs */
/* loaded from: classes.dex */
public final /* synthetic */ class vs implements iz, or6, h61, te3 {
    public final /* synthetic */ int a;

    public /* synthetic */ vs(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest d(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId e(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void f() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void g(int i, int i2) {
        throw new IllegalStateException(("Couldn't read exact size=" + i + ((Object) " but read=") + i2).toString());
    }

    public static /* synthetic */ void h(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void i(int i, String str, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2 + ')').toString());
    }

    public static /* synthetic */ void j(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // defpackage.iz
    public int b(int i, tc6 tc6Var) {
        float f;
        switch (this.a) {
            case 2:
                float f2 = i / 2.0f;
                if (tc6Var == tc6.a) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                return Math.round((1.0f + f) * f2);
            default:
                return Math.round((1.0f + nae.e) * ((i + 0) / 2.0f));
        }
    }

    @Override // defpackage.te3
    public double c(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.a) {
            case 28:
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.0031308049535603718d) {
                    d2 = Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d;
                    d3 = 0.9478672985781991d;
                } else {
                    d3 = 0.07739938080495357d;
                }
                return Math.copySign(d2 / d3, d);
            default:
                if (d < 0.0d) {
                    d4 = -d;
                } else {
                    d4 = d;
                }
                if (d4 >= 0.04045d) {
                    d5 = Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d);
                } else {
                    d5 = d4 * 0.07739938080495357d;
                }
                return Math.copySign(d5, d);
        }
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        long j;
        uwd uwdVar;
        l04 l04Var;
        ly2 ly2Var;
        switch (this.a) {
            case 8:
                rs2 rs2Var = (rs2) obj;
                vs2 vs2Var = rs2Var.b;
                if (rs2Var == vs2Var.j && vs2Var.n != null) {
                    ss2 ss2Var = vs2Var.p;
                    int i = ss2Var.d;
                    if (i != -1) {
                        long j2 = ss2Var.e.f / i;
                        p60 p60Var = vs2Var.t;
                        p60Var.getClass();
                        j = a2d.W(p60Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - vs2Var.W;
                    uwd uwdVar2 = vs2Var.n;
                    int i2 = vs2Var.p.e.f;
                    long e0 = a2d.e0(j);
                    b60 b60Var = ((e47) uwdVar2.b).f1;
                    Handler handler = b60Var.a;
                    if (handler != null) {
                        handler.post(new z50(b60Var, i2, e0, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                rs2 rs2Var2 = (rs2) obj;
                rs2Var2.getClass();
                vs2.c0.getAndDecrement();
                uwd uwdVar3 = rs2Var2.b.n;
                if (uwdVar3 != null) {
                    int i3 = rs2Var2.a.a;
                    zj1 zj1Var = new zj1(17);
                    b60 b60Var2 = ((e47) uwdVar3.b).f1;
                    Handler handler2 = b60Var2.a;
                    if (handler2 != null) {
                        handler2.post(new z50(b60Var2, zj1Var, 3));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                rs2 rs2Var3 = (rs2) obj;
                vs2 vs2Var2 = rs2Var3.b;
                if (rs2Var3 == vs2Var2.j && (uwdVar = vs2Var2.n) != null && vs2Var2.O && (l04Var = ((e47) uwdVar.b).e0) != null) {
                    l04Var.a();
                    return;
                }
                return;
            case 11:
                rs2 rs2Var4 = (rs2) obj;
                vs2 vs2Var3 = rs2Var4.b;
                if (rs2Var4 == vs2Var3.j && vs2Var3.M) {
                    vs2Var3.N = true;
                    return;
                }
                return;
            default:
                uwd uwdVar4 = ((ps2) obj).a.n;
                if (uwdVar4 != null) {
                    e47 e47Var = (e47) uwdVar4.b;
                    synchronized (e47Var.a) {
                        ly2Var = e47Var.N;
                    }
                    if (ly2Var != null) {
                        synchronized (ly2Var.c) {
                            ly2Var.f.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.h61
    public void cancel() {
    }
}
