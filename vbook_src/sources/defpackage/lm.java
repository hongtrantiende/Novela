package defpackage;

import android.util.LruCache;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lm  reason: default package */
/* loaded from: classes3.dex */
public final class lm extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        nm nmVar = (nm) obj2;
        nm nmVar2 = (nm) obj3;
        nmVar.getClass();
        if (z) {
            nmVar.close();
        }
    }
}
