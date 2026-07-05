package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jy9  reason: default package */
/* loaded from: classes.dex */
public final class jy9 extends jbe {
    public final Bundle C;
    public final gy9 D;
    public String E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy9(Bundle bundle, gy9 gy9Var) {
        super(4);
        gy9Var.getClass();
        this.C = bundle;
        this.D = gy9Var;
        this.E = "";
    }

    public static void a0(gy9 gy9Var, o9a o9aVar, Bundle bundle) {
        if (gy9Var.b == 1 && !bundle.containsKey("type")) {
            if (!c16.i(o9aVar.e(), a5b.f) && !c16.i(o9aVar.e(), a5b.i)) {
                return;
            }
            String a = o9aVar.a();
            a.getClass();
            bundle.putString("type", a);
        }
    }

    @Override // defpackage.jbe
    public final void A(long j) {
        String str = this.E;
        str.getClass();
        this.C.putLong(str, j);
    }

    @Override // defpackage.jbe
    public final void D() {
        String str = this.E;
        str.getClass();
        this.C.putString(str, null);
    }

    @Override // defpackage.jbe
    public final void G(s76 s76Var, Object obj) {
        s76Var.getClass();
        o9a e = s76Var.e();
        if (c16.i(e, fy9.a)) {
            qc1 qc1Var = qc1.a;
            obj.getClass();
            qc1.g(this, (CharSequence) obj);
        } else if (c16.i(e, fy9.b)) {
            kw2 kw2Var = kw2.b;
            obj.getClass();
            kw2Var.a(this, (Parcelable) obj);
        } else if (c16.i(e, fy9.c)) {
            zu2 zu2Var = zu2.b;
            obj.getClass();
            zu2Var.a(this, (Serializable) obj);
        } else if (c16.i(e, fy9.d)) {
            q9a q9aVar = lj5.a;
            obj.getClass();
            IBinder iBinder = (IBinder) obj;
            iBinder.getClass();
            if (this instanceof jy9) {
                String str = this.E;
                str.getClass();
                this.C.putBinder(str, iBinder);
                return;
            }
            p1a.k(am8.y(lj5.a.a, this));
        } else if (!c16.i(e, fy9.i) && !c16.i(e, fy9.j)) {
            if (!c16.i(e, fy9.k) && !c16.i(e, fy9.l)) {
                if (!c16.i(e, fy9.e) && !c16.i(e, fy9.f)) {
                    if (!c16.i(e, fy9.g) && !c16.i(e, fy9.h)) {
                        if (!c16.i(e, fy9.m) && !c16.i(e, fy9.n) && !c16.i(e, fy9.o)) {
                            o9a e2 = s76Var.e();
                            boolean i = c16.i(e2, ey9.a);
                            Bundle bundle = this.C;
                            if (i) {
                                String str2 = this.E;
                                obj.getClass();
                                str2.getClass();
                                bundle.putIntegerArrayList(str2, iwe.n((List) obj));
                                return;
                            } else if (c16.i(e2, ey9.b)) {
                                String str3 = this.E;
                                obj.getClass();
                                str3.getClass();
                                bundle.putStringArrayList(str3, iwe.n((List) obj));
                                return;
                            } else if (c16.i(e2, ey9.c)) {
                                String str4 = this.E;
                                obj.getClass();
                                str4.getClass();
                                bundle.putBooleanArray(str4, (boolean[]) obj);
                                return;
                            } else if (c16.i(e2, ey9.d)) {
                                String str5 = this.E;
                                obj.getClass();
                                str5.getClass();
                                bundle.putCharArray(str5, (char[]) obj);
                                return;
                            } else if (c16.i(e2, ey9.e)) {
                                String str6 = this.E;
                                obj.getClass();
                                str6.getClass();
                                bundle.putDoubleArray(str6, (double[]) obj);
                                return;
                            } else if (c16.i(e2, ey9.f)) {
                                String str7 = this.E;
                                obj.getClass();
                                str7.getClass();
                                bundle.putFloatArray(str7, (float[]) obj);
                                return;
                            } else if (c16.i(e2, ey9.g)) {
                                String str8 = this.E;
                                obj.getClass();
                                str8.getClass();
                                bundle.putIntArray(str8, (int[]) obj);
                                return;
                            } else if (c16.i(e2, ey9.h)) {
                                String str9 = this.E;
                                obj.getClass();
                                str9.getClass();
                                bundle.putLongArray(str9, (long[]) obj);
                                return;
                            } else if (c16.i(e2, ey9.i)) {
                                String str10 = this.E;
                                obj.getClass();
                                str10.getClass();
                                bundle.putStringArray(str10, (String[]) obj);
                                return;
                            } else {
                                s76Var.a(this, obj);
                                return;
                            }
                        }
                        fwa fwaVar = fwa.a;
                        obj.getClass();
                        fwaVar.a(this, (SparseArray) obj);
                        return;
                    }
                    cm8 cm8Var = cm8.a;
                    obj.getClass();
                    cm8Var.a(this, (List) obj);
                    return;
                }
                q9a q9aVar2 = bm8.a;
                obj.getClass();
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                parcelableArr.getClass();
                if (this instanceof jy9) {
                    String str11 = this.E;
                    str11.getClass();
                    this.C.putParcelableArray(str11, parcelableArr);
                    return;
                }
                p1a.k(am8.y(bm8.a.a, this));
                return;
            }
            pc1 pc1Var = pc1.a;
            obj.getClass();
            pc1Var.a(this, (List) obj);
        } else {
            q9a q9aVar3 = mc1.a;
            obj.getClass();
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            charSequenceArr.getClass();
            if (this instanceof jy9) {
                String str12 = this.E;
                str12.getClass();
                this.C.putCharSequenceArray(str12, charSequenceArr);
                return;
            }
            p1a.k(am8.y(mc1.a.a, this));
        }
    }

    @Override // defpackage.jbe
    public final void H(short s) {
        String str = this.E;
        str.getClass();
        this.C.putInt(str, s);
    }

    @Override // defpackage.jbe
    public final void I(String str) {
        str.getClass();
        String str2 = this.E;
        str2.getClass();
        this.C.putString(str2, str);
    }

    @Override // defpackage.jbe
    public final wf2 T() {
        return this.D.a;
    }

    @Override // defpackage.jbe
    public final boolean V(o9a o9aVar) {
        o9aVar.getClass();
        this.D.getClass();
        return false;
    }

    @Override // defpackage.jbe
    public final jbe k(o9a o9aVar) {
        o9aVar.getClass();
        boolean i = c16.i(this.E, "");
        Bundle bundle = this.C;
        gy9 gy9Var = this.D;
        if (i) {
            a0(gy9Var, o9aVar, bundle);
            return this;
        }
        Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
        String str = this.E;
        str.getClass();
        bundle.putBundle(str, v);
        a0(gy9Var, o9aVar, v);
        return new jy9(v, gy9Var);
    }

    @Override // defpackage.jbe
    public final void n(boolean z) {
        String str = this.E;
        str.getClass();
        this.C.putBoolean(str, z);
    }

    @Override // defpackage.jbe
    public final void p(byte b) {
        String str = this.E;
        str.getClass();
        this.C.putInt(str, b);
    }

    @Override // defpackage.jbe
    public final void q(char c) {
        String str = this.E;
        str.getClass();
        this.C.putChar(str, c);
    }

    @Override // defpackage.jbe
    public final void r(double d) {
        String str = this.E;
        str.getClass();
        this.C.putDouble(str, d);
    }

    @Override // defpackage.jbe
    public final void s(o9a o9aVar, int i) {
        o9aVar.getClass();
        this.E = o9aVar.g(i);
        if (this.D.b == 1) {
            Bundle bundle = this.C;
            boolean containsKey = bundle.containsKey("type");
            boolean i2 = c16.i(this.E, "type");
            if (containsKey && i2) {
                String string = bundle.getString("type");
                if (string != null) {
                    vs.m(s21.q(a82.o("SavedStateEncoder for ", string, " has property '"), this.E, "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation."));
                } else {
                    gwe.l("type");
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.jbe
    public final void t(o9a o9aVar, int i) {
        o9aVar.getClass();
        String str = this.E;
        str.getClass();
        this.C.putInt(str, i);
    }

    @Override // defpackage.jbe
    public final void u(float f) {
        String str = this.E;
        str.getClass();
        this.C.putFloat(str, f);
    }

    @Override // defpackage.jbe
    public final void y(int i) {
        String str = this.E;
        str.getClass();
        this.C.putInt(str, i);
    }
}
