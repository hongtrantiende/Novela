package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xed  reason: default package */
/* loaded from: classes.dex */
public final class xed implements rb7 {
    public final String a;
    public final String b;

    public xed(String str, String str2) {
        this.a = kve.C(str);
        this.b = str2;
    }

    @Override // defpackage.rb7
    public final void b(i57 i57Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer u = hc2.u(str2);
                if (u != null) {
                    i57Var.i = u;
                    return;
                }
                return;
            case 1:
                Integer u2 = hc2.u(str2);
                if (u2 != null) {
                    i57Var.v = u2;
                    return;
                }
                return;
            case 2:
                Integer u3 = hc2.u(str2);
                if (u3 != null) {
                    i57Var.h = u3;
                    return;
                }
                return;
            case 3:
                i57Var.c = str2;
                return;
            case 4:
                i57Var.w = str2;
                return;
            case 5:
                i57Var.a = str2;
                return;
            case 6:
                i57Var.e = str2;
                return;
            case 7:
                Integer u4 = hc2.u(str2);
                if (u4 != null) {
                    i57Var.u = u4;
                    return;
                }
                return;
            case '\b':
                i57Var.d = str2;
                return;
            case '\t':
                i57Var.b = str2;
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xed.class == obj.getClass()) {
            xed xedVar = (xed) obj;
            if (this.a.equals(xedVar.a) && this.b.equals(xedVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + eub.j(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
