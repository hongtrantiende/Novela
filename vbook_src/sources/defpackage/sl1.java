package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: sl1 */
/* loaded from: classes3.dex */
public abstract class sl1 extends xl1 {
    public static HashSet A0(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(p17.k(tl1.s(iterable, 12)));
        y0(iterable, hashSet);
        return hashSet;
    }

    public static int[] B0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List C0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return tl1.A(next);
            }
            return ks3.a;
        }
        return tl1.D(F0(iterable));
    }

    public static long[] D0(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList E0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List F0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        y0(iterable, arrayList);
        return arrayList;
    }

    public static Set G0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set H0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(p17.k(collection.size()));
                    y0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return fca.B(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            y0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return fca.B(linkedHashSet2.iterator().next());
            }
        }
        return rs3.a;
    }

    public static ArrayList I0(int i, List list, int i2) {
        String l;
        Iterator O;
        int i3;
        list.getClass();
        if (i > 0 && i2 > 0) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i4 = size / i2;
                if (size % i2 == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                ArrayList arrayList = new ArrayList(i4 + i3);
                int i5 = 0;
                while (i5 >= 0 && i5 < size) {
                    int i6 = size - i5;
                    if (i <= i6) {
                        i6 = i;
                    }
                    ArrayList arrayList2 = new ArrayList(i6);
                    for (int i7 = 0; i7 < i6; i7++) {
                        arrayList2.add(list.get(i7 + i5));
                    }
                    arrayList.add(arrayList2);
                    i5 += i2;
                }
                return arrayList;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            if (!it.hasNext()) {
                O = js3.a;
            } else {
                O = h9a.O(new zpa(i, i2, it, null));
            }
            while (O.hasNext()) {
                arrayList3.add((List) O.next());
            }
            return arrayList3;
        }
        if (i != i2) {
            l = hl5.i(i, i2, "Both size ", " and step ", " must be greater than zero.");
        } else {
            l = hl5.l("size ", " must be greater than zero.", i);
        }
        p1a.k(l);
        return null;
    }

    public static final int T(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder s = hl5.s("Element index ", " must be in range [", i);
        s.append(new ry5(0, list.size() - 1, 1));
        s.append("].");
        throw new IndexOutOfBoundsException(s.toString());
    }

    public static final int U(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder s = hl5.s("Position index ", " must be in range [", i);
        s.append(new ry5(0, list.size(), 1));
        s.append("].");
        throw new IndexOutOfBoundsException(s.toString());
    }

    public static c00 V(Iterable iterable) {
        iterable.getClass();
        return new c00(iterable, 1);
    }

    public static boolean W(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (c16.i(obj, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        tl1.M();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static List X(Iterable iterable) {
        iterable.getClass();
        return C0(G0(iterable));
    }

    public static List Y(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return C0(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return ks3.a;
                }
                if (size == 1) {
                    if (iterable instanceof List) {
                        obj = j0((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            obj = next;
                        } else {
                            p1a.l("Collection is empty.");
                            return null;
                        }
                    }
                    return tl1.A(obj);
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj2 : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj2);
                } else {
                    i2++;
                }
            }
            return tl1.D(arrayList);
        }
        p1a.k(hl5.l("Requested element count ", " is less than zero.", i));
        return null;
    }

    public static List Z(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return v0(list, size);
    }

    public static ArrayList a0(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object b0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return c0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        p1a.l("Collection is empty.");
        return null;
    }

    public static Object c0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        p1a.l("List is empty.");
        return null;
    }

    public static Object d0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object e0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object f0(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static final void g0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, xt4 xt4Var) {
        iterable.getClass();
        charSequence2.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            hre.g(sb, obj, xt4Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void h0(List list, StringBuilder sb, String str, xt4 xt4Var, int i) {
        CharSequence charSequence;
        if ((i & 4) != 0) {
            charSequence = "";
        } else {
            charSequence = "Errors: ";
        }
        if ((i & 64) != 0) {
            xt4Var = null;
        }
        g0(list, sb, str, charSequence, "", "...", xt4Var);
    }

    public static String i0(Iterable iterable, CharSequence charSequence, String str, String str2, xt4 xt4Var, int i) {
        String str3;
        String str4;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            xt4Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        g0(iterable, sb, charSequence2, str3, str4, "...", xt4Var);
        return sb.toString();
    }

    public static Object j0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        p1a.l("List is empty.");
        return null;
    }

    public static Object k0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList l0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && c16.i(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList m0(lc1 lc1Var, lc1 lc1Var2) {
        if (lc1Var instanceof Collection) {
            return n0((Collection) lc1Var, lc1Var2);
        }
        ArrayList arrayList = new ArrayList();
        xl1.P(arrayList, lc1Var);
        xl1.P(arrayList, lc1Var2);
        return arrayList;
    }

    public static ArrayList n0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        xl1.P(arrayList2, iterable);
        return arrayList2;
    }

    public static ArrayList o0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List p0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C0(iterable);
        }
        List F0 = F0(iterable);
        Collections.reverse(F0);
        return F0;
    }

    public static Object q0(Iterable iterable) {
        if (iterable instanceof List) {
            return r0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            vs.m("Collection has more than one element.");
            return null;
        }
        p1a.l("Collection is empty.");
        return null;
    }

    public static Object r0(List list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            vs.m("List has more than one element.");
            return null;
        }
        p1a.l("List is empty.");
        return null;
    }

    public static Object s0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List t0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            array.getClass();
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List F0 = F0(iterable);
        wl1.N(F0);
        return F0;
    }

    public static List u0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List F0 = F0(iterable);
        wl1.O(comparator, F0);
        return F0;
    }

    public static List v0(Iterable iterable, int i) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return ks3.a;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return C0(iterable);
                }
                if (i == 1) {
                    return tl1.A(b0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return tl1.D(arrayList);
        }
        p1a.k(hl5.l("Requested element count ", " is less than zero.", i));
        return null;
    }

    public static List w0(int i, List list) {
        if (i >= 0) {
            if (i == 0) {
                return ks3.a;
            }
            int size = list.size();
            if (i >= size) {
                return C0(list);
            }
            if (i == 1) {
                return tl1.A(j0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        p1a.k(hl5.l("Requested element count ", " is less than zero.", i));
        return null;
    }

    public static byte[] x0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void y0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static float[] z0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }
}
