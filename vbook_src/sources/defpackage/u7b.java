package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u7b  reason: default package */
/* loaded from: classes3.dex */
public final class u7b implements nj5 {
    public volatile boolean a = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // defpackage.nj5
    public final synchronized pw6 a(String str) {
        t7b t7bVar;
        t7bVar = (t7b) this.b.get(str);
        if (t7bVar == null) {
            t7bVar = new t7b(str, this.c, this.a);
            this.b.put(str, t7bVar);
        }
        return t7bVar;
    }
}
