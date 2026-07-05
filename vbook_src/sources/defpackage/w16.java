package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w16  reason: default package */
/* loaded from: classes.dex */
public final class w16 {
    public final WorkDatabase_Impl a;
    public final koc b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final v16 e;
    public final v16 f;
    public final Object g;

    public w16(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = workDatabase_Impl;
        koc kocVar = new koc(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.j, new mz1(1, this, w16.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 26));
        this.b = kocVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new v16(this, 0);
        this.f = new v16(this, 1);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        kocVar.k = new t42(this, 29);
    }

    public final Object a(aab aabVar) {
        Object h;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        if ((!workDatabase_Impl.j() || workDatabase_Impl.m()) && (h = this.b.h(aabVar)) == n82.a) {
            return h;
        }
        return pvc.a;
    }
}
