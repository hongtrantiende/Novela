package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xx7  reason: default package */
/* loaded from: classes3.dex */
public final class xx7 implements c26 {
    public final /* synthetic */ yx7 a;

    public xx7(yx7 yx7Var) {
        this.a = yx7Var;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final String getNamespaceURI(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final String getPrefix(String str) {
        sy5 sy5Var;
        Object obj;
        sy5 sy5Var2;
        str.getClass();
        String obj2 = str.toString();
        int hashCode = obj2.hashCode();
        yx7 yx7Var = this.a;
        if (hashCode != 0) {
            if (hashCode != 557947472) {
                if (hashCode == 1952986079 && obj2.equals("http://www.w3.org/XML/1998/namespace")) {
                    return "xml";
                }
            } else if (obj2.equals("http://www.w3.org/2000/xmlns/")) {
                return "xmlns";
            }
        } else if (obj2.equals("")) {
            ty5 F = dce.F(0, yx7Var.f());
            if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
                Iterator it = F.iterator();
                do {
                    sy5Var = (sy5) it;
                    if (sy5Var.c) {
                    }
                } while (yx7Var.e(sy5Var.nextInt()).length() != 0);
                return null;
            }
            return "";
        }
        Iterator it2 = dce.r(yx7Var.f() - 1, 0).iterator();
        loop0: while (true) {
            sy5 sy5Var3 = (sy5) it2;
            if (sy5Var3.c) {
                obj = sy5Var3.next();
                int intValue = ((Number) obj).intValue();
                if (yx7Var.c(intValue).equals(obj2)) {
                    ty5 F2 = dce.F(intValue + 1, yx7Var.f());
                    if (!(F2 instanceof Collection) || !((Collection) F2).isEmpty()) {
                        Iterator it3 = F2.iterator();
                        do {
                            sy5Var2 = (sy5) it3;
                            if (!sy5Var2.c) {
                                break loop0;
                            }
                        } while (!yx7Var.e(intValue).equals(yx7Var.e(sy5Var2.nextInt())));
                    } else {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return null;
        }
        return yx7Var.e(num.intValue());
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final Iterator getPrefixes(String str) {
        str.getClass();
        yx7 yx7Var = this.a;
        return new ak(new ki4(3, new ff4(new c00(dce.r(yx7Var.f() - 1, 0), 1), true, new fl7(8, yx7Var, str)), new cl7(yx7Var, 6)));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b2(this.a, 2);
    }
}
