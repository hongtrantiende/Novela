package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: amd  reason: default package */
/* loaded from: classes.dex */
public final class amd {
    public static final String i = r95.r("WorkContinuationImpl");
    public final lmd a;
    public final String b;
    public final kz3 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public mu9 h;

    public amd(lmd lmdVar, String str, kz3 kz3Var, List list, int i2) {
        this.a = lmdVar;
        this.b = str;
        this.c = kz3Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (kz3Var == kz3.a && ((umd) list.get(i3)).b.u != Long.MAX_VALUE) {
                vs.m("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((umd) list.get(i3)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(amd amdVar) {
        HashSet hashSet = new HashSet();
        amdVar.getClass();
        return hashSet;
    }

    public final mu9 a() {
        if (!this.g) {
            lmd lmdVar = this.a;
            r0f r0fVar = lmdVar.b.m;
            this.h = kve.y(r0fVar, "EnqueueRunnable_" + this.c.name(), lmdVar.d.a, new imb(this, 21));
        } else {
            r95 n = r95.n();
            n.s(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        }
        return this.h;
    }
}
