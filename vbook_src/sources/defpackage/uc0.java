package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc0  reason: default package */
/* loaded from: classes.dex */
public final class uc0 extends bw6 {
    public final long a;
    public final Integer b;
    public final lt1 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final j18 h;
    public final f14 i;

    public uc0(long j, Integer num, lt1 lt1Var, long j2, byte[] bArr, String str, long j3, j18 j18Var, f14 f14Var) {
        this.a = j;
        this.b = num;
        this.c = lt1Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = j18Var;
        this.i = f14Var;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bw6) {
            bw6 bw6Var = (bw6) obj;
            uc0 uc0Var = (uc0) bw6Var;
            if (this.a == uc0Var.a) {
                Integer num = uc0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    lt1 lt1Var = uc0Var.c;
                    lt1 lt1Var2 = this.c;
                    if (lt1Var2 != null ? lt1Var2.equals(lt1Var) : lt1Var == null) {
                        if (this.d == uc0Var.d) {
                            if (bw6Var instanceof uc0) {
                                bArr = ((uc0) bw6Var).e;
                            } else {
                                bArr = uc0Var.e;
                            }
                            if (Arrays.equals(this.e, bArr)) {
                                String str = uc0Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == uc0Var.g) {
                                        j18 j18Var = uc0Var.h;
                                        j18 j18Var2 = this.h;
                                        if (j18Var2 != null ? j18Var2.equals(j18Var) : j18Var == null) {
                                            f14 f14Var = uc0Var.i;
                                            f14 f14Var2 = this.i;
                                            if (f14Var2 != null ? f14Var2.equals(f14Var) : f14Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        lt1 lt1Var = this.c;
        if (lt1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lt1Var.hashCode();
        }
        long j2 = this.d;
        int hashCode5 = (((((i3 ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j3 = this.g;
        int i4 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j18 j18Var = this.h;
        if (j18Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j18Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        f14 f14Var = this.i;
        if (f14Var != null) {
            i2 = f14Var.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
