package defpackage;

import java.util.ArrayList;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sub  reason: default package */
/* loaded from: classes.dex */
public final class sub extends wk5 {
    public final String b;
    public final qs5 c;

    public sub(String str, String str2, mm9 mm9Var) {
        super(str);
        wq9.s(!mm9Var.isEmpty());
        this.b = str2;
        qs5 l = qs5.l(mm9Var);
        this.c = l;
        String str3 = (String) l.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            } else {
                if (str.length() >= 4) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                }
                return arrayList;
            }
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.rb7
    public final void b(i57 i57Var) {
        char c;
        Integer num;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        qs5 qs5Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    i57Var.c = (CharSequence) qs5Var.get(0);
                    return;
                case 1:
                case 11:
                    i57Var.s = (CharSequence) qs5Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) qs5Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    i57Var.m = Integer.valueOf(parseInt);
                    i57Var.n = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    i57Var.b = (CharSequence) qs5Var.get(0);
                    return;
                case 4:
                case 19:
                    i57Var.d = (CharSequence) qs5Var.get(0);
                    return;
                case 5:
                case 20:
                    i57Var.t = (CharSequence) qs5Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = a2d.a;
                    String[] split = ((String) qs5Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    i57Var.h = Integer.valueOf(parseInt3);
                    i57Var.i = num;
                    return;
                case 7:
                case 17:
                    i57Var.a = (CharSequence) qs5Var.get(0);
                    return;
                case '\b':
                case 16:
                    i57Var.r = (CharSequence) qs5Var.get(0);
                    return;
                case '\t':
                case 22:
                    i57Var.l = Integer.valueOf(Integer.parseInt((String) qs5Var.get(0)));
                    return;
                case '\f':
                    Integer u = hc2.u((String) qs5Var.get(0));
                    if (u == null) {
                        i57Var.w = (CharSequence) qs5Var.get(0);
                        return;
                    }
                    String a = yk5.a(u.intValue());
                    if (a != null) {
                        i57Var.w = a;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) qs5Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                i57Var.n = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        i57Var.m = (Integer) d.get(1);
                    }
                    i57Var.l = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d2 = d((String) qs5Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                i57Var.q = (Integer) d2.get(2);
                            } else {
                                return;
                            }
                        }
                        i57Var.p = (Integer) d2.get(1);
                    }
                    i57Var.o = (Integer) d2.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sub.class == obj.getClass()) {
                sub subVar = (sub) obj;
                if (this.a.equals(subVar.a) && Objects.equals(this.b, subVar.b) && this.c.equals(subVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = eub.j(527, 31, this.a);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((j + i) * 31);
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
