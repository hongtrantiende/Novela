package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nb0  reason: default package */
/* loaded from: classes.dex */
public final class nb0 extends ga2 {
    public final ob0 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final fa2 e;
    public final List f;
    public final int g;

    public nb0(ob0 ob0Var, List list, List list2, Boolean bool, fa2 fa2Var, List list3, int i) {
        this.a = ob0Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = fa2Var;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ga2) {
                nb0 nb0Var = (nb0) ((ga2) obj);
                if (this.a.equals(nb0Var.a)) {
                    List list = nb0Var.b;
                    List list2 = this.b;
                    if (list2 == null) {
                        if (list != null) {
                            return false;
                        }
                    } else if (!list2.equals(list)) {
                        return false;
                    }
                    List list3 = nb0Var.c;
                    List list4 = this.c;
                    if (list4 == null) {
                        if (list3 != null) {
                            return false;
                        }
                    } else if (!list4.equals(list3)) {
                        return false;
                    }
                    Boolean bool = nb0Var.d;
                    Boolean bool2 = this.d;
                    if (bool2 == null) {
                        if (bool != null) {
                            return false;
                        }
                    } else if (!bool2.equals(bool)) {
                        return false;
                    }
                    fa2 fa2Var = nb0Var.e;
                    fa2 fa2Var2 = this.e;
                    if (fa2Var2 == null) {
                        if (fa2Var != null) {
                            return false;
                        }
                    } else if (!fa2Var2.equals(fa2Var)) {
                        return false;
                    }
                    List list5 = nb0Var.f;
                    List list6 = this.f;
                    if (list6 == null) {
                        if (list5 != null) {
                            return false;
                        }
                    } else if (!list6.equals(list5)) {
                        return false;
                    }
                    if (this.g == nb0Var.g) {
                        return true;
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
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        fa2 fa2Var = this.e;
        if (fa2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fa2Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List list3 = this.f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return this.g ^ ((i5 ^ i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return rs8.g(this.g, "}", sb);
    }
}
