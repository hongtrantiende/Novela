package defpackage;

import android.net.NetworkRequest;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w02  reason: default package */
/* loaded from: classes.dex */
public final class w02 {
    public static final w02 j = new w02();
    public final c28 a;
    public final w18 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public w02(w02 w02Var) {
        w02Var.getClass();
        this.c = w02Var.c;
        this.d = w02Var.d;
        this.b = w02Var.b;
        this.a = w02Var.a;
        this.e = w02Var.e;
        this.f = w02Var.f;
        this.i = w02Var.i;
        this.g = w02Var.g;
        this.h = w02Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !w02.class.equals(obj.getClass())) {
            return false;
        }
        w02 w02Var = (w02) obj;
        if (this.c != w02Var.c || this.d != w02Var.d || this.e != w02Var.e || this.f != w02Var.f || this.g != w02Var.g || this.h != w02Var.h || !c16.i(a(), w02Var.a()) || this.a != w02Var.a) {
            return false;
        }
        return c16.i(this.i, w02Var.i);
    }

    public final int hashCode() {
        int i;
        long j2 = this.g;
        long j3 = this.h;
        int b = s21.b(this.i, ((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        NetworkRequest a = a();
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        return b + i;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public w02(w18 w18Var, c28 c28Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = w18Var;
        this.a = c28Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public w02() {
        this.b = new w18(null);
        this.a = c28.a;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = rs3.a;
    }
}
