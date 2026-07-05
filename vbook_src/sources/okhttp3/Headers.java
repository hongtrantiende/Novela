package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal._UtilCommonKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Headers implements Iterable<yk8>, j76 {
    public static final Headers b = new Headers(new String[0]);
    public final String[] a;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        public final ArrayList a = new ArrayList(20);

        public final Headers a() {
            return new Headers((String[]) this.a.toArray(new String[0]));
        }

        public final void b(String str) {
            str.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i < arrayList.size()) {
                    if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                        arrayList.remove(i);
                        arrayList.remove(i);
                        i -= 2;
                    }
                    i += 2;
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public Headers(String[] strArr) {
        strArr.getClass();
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        strArr.getClass();
        int length = strArr.length - 2;
        int j = vae.j(length, 0, -2);
        if (j <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != j) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        String str = (String) b00.q0(i * 2, this.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final Builder c() {
        Builder builder = new Builder();
        ArrayList arrayList = builder.a;
        arrayList.getClass();
        String[] strArr = this.a;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return builder;
    }

    public final String d(int i) {
        String str = (String) b00.q0((i * 2) + 1, this.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final List e(String str) {
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        if (list == null) {
            return ks3.a;
        }
        return list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            if (Arrays.equals(this.a, ((Headers) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<yk8> iterator() {
        int size = size();
        yk8[] yk8VarArr = new yk8[size];
        for (int i = 0; i < size; i++) {
            yk8VarArr[i] = new yk8(b(i), d(i));
        }
        return new b2(yk8VarArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (_UtilCommonKt.k(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
