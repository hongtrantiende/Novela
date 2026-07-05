package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy3  reason: default package */
/* loaded from: classes.dex */
public final class oy3 {
    public static final lh9 c = new lh9(24);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final s6f b;

    /* JADX WARN: Type inference failed for: r5v3, types: [s6f, java.lang.Object] */
    public oy3(String str, boolean z) {
        ReentrantLock reentrantLock;
        s6f s6fVar;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            ?? obj2 = new Object();
            obj2.a = str.concat(".lck");
            s6fVar = obj2;
        } else {
            s6fVar = null;
        }
        this.b = s6fVar;
    }
}
