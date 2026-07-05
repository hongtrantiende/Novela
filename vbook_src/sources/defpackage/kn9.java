package defpackage;

import android.os.Trace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kn9  reason: default package */
/* loaded from: classes3.dex */
public final class kn9 {
    public final HashMap a;

    public kn9(Set set) {
        this.a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jn9 jn9Var = (jn9) it.next();
            HashMap hashMap = this.a;
            jn9Var.getClass();
            hashMap.put(ie2.class, jn9Var.a);
        }
    }

    public static int[] a(String str) {
        try {
            if (!str.isEmpty()) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
                int countTokens = stringTokenizer.countTokens();
                int[] iArr = new int[countTokens];
                for (int i = 0; i < countTokens; i++) {
                    iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
                }
                return iArr;
            }
            throw new IllegalArgumentException("Version string is empty");
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(hl5.n("Unable to parse HTTP flags version string: `", str, "`"), e);
        }
    }

    public static kn9 b(ii4 ii4Var, String str, boolean z) {
        s0a.o("Cronet ResolvedFlags#resolve");
        try {
            a(str);
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : Collections.unmodifiableMap(ii4Var.e).entrySet()) {
                try {
                    Iterator it = ((fi4) entry.getValue()).e.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            if (!z) {
                                throw null;
                            }
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                } catch (RuntimeException e) {
                    throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + "`", e);
                }
            }
            kn9 kn9Var = new kn9(hashMap);
            Trace.endSection();
            return kn9Var;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public kn9() {
        this.a = new HashMap();
    }

    public kn9(HashMap hashMap) {
        this.a = hashMap;
    }
}
