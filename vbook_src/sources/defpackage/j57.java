package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j57  reason: default package */
/* loaded from: classes.dex */
public final class j57 {
    public static final j57 B;
    public final qs5 A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i57] */
    static {
        ?? obj = new Object();
        ms5 ms5Var = qs5.b;
        obj.z = mm9.e;
        B = new j57(obj);
        a82.s(0, 1, 2, 3, 4);
        a82.s(5, 6, 8, 9, 10);
        a82.s(11, 12, 13, 14, 15);
        a82.s(16, 17, 18, 19, 20);
        a82.s(21, 22, 23, 24, 25);
        a82.s(26, 27, 28, 29, 30);
        a82.s(31, 32, 33, 34, 1000);
    }

    public j57(i57 i57Var) {
        Boolean bool = i57Var.k;
        Integer num = i57Var.j;
        Integer num2 = i57Var.y;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case Token.GETPROP /* 33 */:
                        case Token.GETPROPNOWARN /* 34 */:
                        case Token.GETPROP_SUPER /* 35 */:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = i57Var.a;
        this.b = i57Var.b;
        this.c = i57Var.c;
        this.d = i57Var.d;
        this.e = i57Var.e;
        this.f = i57Var.f;
        this.g = i57Var.g;
        this.h = i57Var.h;
        this.i = i57Var.i;
        this.j = num;
        this.k = bool;
        Integer num3 = i57Var.l;
        this.l = num3;
        this.m = num3;
        this.n = i57Var.m;
        this.o = i57Var.n;
        this.p = i57Var.o;
        this.q = i57Var.p;
        this.r = i57Var.q;
        this.s = i57Var.r;
        this.t = i57Var.s;
        this.u = i57Var.t;
        this.v = i57Var.u;
        this.w = i57Var.v;
        this.x = i57Var.w;
        this.y = i57Var.x;
        this.z = num2;
        this.A = i57Var.z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i57] */
    public final i57 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j57.class == obj.getClass()) {
                j57 j57Var = (j57) obj;
                if (TextUtils.equals(this.a, j57Var.a) && TextUtils.equals(this.b, j57Var.b) && TextUtils.equals(this.c, j57Var.c) && TextUtils.equals(this.d, j57Var.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, j57Var.e) && Arrays.equals(this.f, j57Var.f) && Objects.equals(this.g, j57Var.g) && Objects.equals(this.h, j57Var.h) && Objects.equals(this.i, j57Var.i) && Objects.equals(this.j, j57Var.j) && Objects.equals(this.k, j57Var.k) && Objects.equals(this.m, j57Var.m) && Objects.equals(this.n, j57Var.n) && Objects.equals(this.o, j57Var.o) && Objects.equals(this.p, j57Var.p) && Objects.equals(this.q, j57Var.q) && Objects.equals(this.r, j57Var.r) && TextUtils.equals(this.s, j57Var.s) && TextUtils.equals(this.t, j57Var.t) && TextUtils.equals(this.u, j57Var.u) && Objects.equals(this.v, j57Var.v) && Objects.equals(this.w, j57Var.w) && TextUtils.equals(this.x, j57Var.x) && TextUtils.equals(null, null) && TextUtils.equals(this.y, j57Var.y) && Objects.equals(this.z, j57Var.z) && Objects.equals(this.A, j57Var.A)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
