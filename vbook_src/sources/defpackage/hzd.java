package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hzd  reason: default package */
/* loaded from: classes.dex */
public abstract class hzd {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof m1e) {
            List zza = ((m1e) iterable).zza();
            if (list == null) {
                list.size();
                Iterator it = zza.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (!(next instanceof szd)) {
                        if (next instanceof byte[]) {
                            byte[] bArr = (byte[]) next;
                            szd.h(bArr, 0, bArr.length);
                            throw null;
                        }
                        String str = (String) next;
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            vm1.h();
        } else if (!(iterable instanceof h2e)) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof j2e) {
                    j2e j2eVar = (j2e) list;
                    int i = j2eVar.c + size;
                    int length = j2eVar.b.length;
                    if (i > length) {
                        if (length != 0) {
                            while (length < i) {
                                length = eub.i(length, 3, 2, 1, 10);
                            }
                            j2eVar.b = Arrays.copyOf(j2eVar.b, length);
                        } else {
                            j2eVar.b = new Object[Math.max(i, 10)];
                        }
                    }
                }
            }
            int size2 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size3 = list2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    Object obj = list2.get(i2);
                    if (obj != null) {
                        list.add(obj);
                    } else {
                        m0e.a(size2, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    m0e.a(size2, list);
                    throw null;
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    public final byte[] a() {
        try {
            o0e o0eVar = (o0e) this;
            int m = o0eVar.m();
            byte[] bArr = new byte[m];
            boolean z = g0e.b;
            wzd wzdVar = new wzd(bArr, m);
            o0eVar.f(wzdVar);
            if (wzdVar.x() <= 0) {
                if (wzdVar.x() >= 0) {
                    return bArr;
                }
                throw new IllegalStateException("Wrote more data than expected.");
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            cp8.p(nk2.v(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void b(OutputStream outputStream) {
        o0e o0eVar = (o0e) this;
        int m = o0eVar.m();
        boolean z = g0e.b;
        if (m > 4096) {
            m = 4096;
        }
        yzd yzdVar = new yzd(outputStream, m);
        o0eVar.f(yzdVar);
        if (yzdVar.e > 0) {
            yzdVar.B();
        }
    }

    public abstract int c(m2e m2eVar);
}
