package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vc0  reason: default package */
/* loaded from: classes.dex */
public final class vc0 extends fw6 {
    public final long a;
    public final long b;
    public final ua0 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public vc0(long j, long j2, ua0 ua0Var, Integer num, String str, ArrayList arrayList) {
        ab9 ab9Var = ab9.a;
        this.a = j;
        this.b = j2;
        this.c = ua0Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof fw6) {
                vc0 vc0Var = (vc0) ((fw6) obj);
                if (this.a == vc0Var.a && this.b == vc0Var.b && this.c.equals(vc0Var.c)) {
                    Integer num = vc0Var.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = vc0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f.equals(vc0Var.f)) {
                        Object obj2 = ab9.a;
                        if (obj2.equals(obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return ((this.f.hashCode() ^ ((i2 ^ i) * 1000003)) * 1000003) ^ ab9.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + ab9.a + "}";
    }
}
