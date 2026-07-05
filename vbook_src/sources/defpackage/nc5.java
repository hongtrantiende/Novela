package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nc5  reason: default package */
/* loaded from: classes3.dex */
public abstract class nc5 {
    public static final Set a = b00.F0(new String[]{"a", "abbr", "audio", "b", "br", "cite", "code", "del", "em", "emoji", "i", "img", "ins", "kbd", "mark", "s", "small", "span", "strike", "strong", "sub", "sup", "u", "user", "var", "video", "wbr"});

    public static void a(mc5 mc5Var, int i, int i2, ArrayList arrayList) {
        if (i < i2) {
            String substring = mc5Var.a.substring(i, i2);
            if (substring.length() == 0) {
                return;
            }
            int[] iArr = mc5Var.b;
            arrayList.add(new jc5(new cc5(substring, iArr[i], iArr[i2])));
        }
    }

    public static final void b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        int i;
        List C0;
        Object obj;
        int a2;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = -1;
                if (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (!c((dc5) obj2)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                C0 = ks3.a;
            } else {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else if (!c((dc5) listIterator.previous())) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                C0 = sl1.C0(arrayList.subList(i2, i + 1));
            }
            List list = C0;
            arrayList.clear();
            if (list.isEmpty()) {
                return;
            }
            rv5 rv5Var = rv5.a;
            if (rv5Var.equals(rv5Var)) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!c((dc5) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                dc5 dc5Var = (dc5) obj;
                if (dc5Var != null) {
                    a2 = dc5Var.a();
                } else {
                    a2 = ((dc5) sl1.c0(list)).a();
                }
                arrayList2.add(new xa5("Dropped root inline content", a2));
            } else if (rv5Var.equals(sv5.a)) {
                arrayList3.add(new bc5("p", ls3.a, list, ((dc5) sl1.c0(list)).a(), ((dc5) sl1.j0(list)).b()));
            } else {
                xk5.o();
            }
        }
    }

    public static boolean c(dc5 dc5Var) {
        if ((dc5Var instanceof cc5) && k4b.j0(((cc5) dc5Var).a)) {
            return true;
        }
        return false;
    }
}
