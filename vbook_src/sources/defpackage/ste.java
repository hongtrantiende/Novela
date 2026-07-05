package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ste  reason: default package */
/* loaded from: classes.dex */
public final class ste implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8f b;
    public final /* synthetic */ mve c;

    public /* synthetic */ ste(mve mveVar, d8f d8fVar, int i) {
        this.a = i;
        this.b = d8fVar;
        this.c = mveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d8f d8fVar = this.b;
        mve mveVar = this.c;
        switch (i) {
            case 0:
                mveVar.a.W();
                mveVar.a.Z(d8fVar);
                return;
            case 1:
                mveVar.a.W();
                a6f a6fVar = mveVar.a;
                a6fVar.f().W();
                a6fVar.m0();
                am8.s(d8fVar);
                String str = d8fVar.a;
                am8.p(str);
                int i2 = 0;
                if (a6fVar.f0().i0(null, yme.y0)) {
                    a6fVar.e().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int g0 = a6fVar.f0().g0(null, yme.h0);
                    a6fVar.f0();
                    long longValue = currentTimeMillis - ((Long) yme.e.a(null)).longValue();
                    while (i2 < g0 && a6fVar.I(longValue, null)) {
                        i2++;
                    }
                } else {
                    a6fVar.f0();
                    long intValue = ((Integer) yme.l.a(null)).intValue();
                    while (i2 < intValue && a6fVar.I(0L, str)) {
                        i2++;
                    }
                }
                if (a6fVar.f0().i0(null, yme.z0)) {
                    a6fVar.f().W();
                    a6fVar.H();
                }
                k5f k5fVar = a6fVar.F;
                int e = eub.e(d8fVar.a0);
                k5fVar.W();
                if (e == 2 && !k5f.a0(str)) {
                    lse lseVar = k5fVar.b.a;
                    a6f.U(lseVar);
                    soe j0 = lseVar.j0(str);
                    if (j0 != null && j0.H() && !j0.I().u().isEmpty()) {
                        a6fVar.c().J.f(str, "[sgtm] Going background, trigger client side upload. appId");
                        a6fVar.e().getClass();
                        a6fVar.r(System.currentTimeMillis(), str);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mveVar.a.W();
                a6f a6fVar2 = mveVar.a;
                a6fVar2.f().W();
                a6fVar2.m0();
                am8.p(d8fVar.a);
                a6fVar2.d0(d8fVar);
                return;
            case 3:
                mveVar.a.W();
                a6f a6fVar3 = mveVar.a;
                if (a6fVar3.U != null) {
                    ArrayList arrayList = new ArrayList();
                    a6fVar3.V = arrayList;
                    arrayList.addAll(a6fVar3.U);
                }
                z9e z9eVar = a6fVar3.c;
                a6f.U(z9eVar);
                lte lteVar = (lte) z9eVar.a;
                String str2 = d8fVar.a;
                am8.s(str2);
                am8.p(str2);
                z9eVar.W();
                z9eVar.Y();
                try {
                    SQLiteDatabase O0 = z9eVar.O0();
                    String[] strArr = {str2};
                    int delete = O0.delete("apps", "app_id=?", strArr) + O0.delete("events", "app_id=?", strArr) + O0.delete("events_snapshot", "app_id=?", strArr) + O0.delete("user_attributes", "app_id=?", strArr) + O0.delete("conditional_properties", "app_id=?", strArr) + O0.delete("raw_events", "app_id=?", strArr) + O0.delete("raw_events_metadata", "app_id=?", strArr) + O0.delete("queue", "app_id=?", strArr) + O0.delete("audience_filter_values", "app_id=?", strArr) + O0.delete("main_event_params", "app_id=?", strArr) + O0.delete("default_event_params", "app_id=?", strArr) + O0.delete("trigger_uris", "app_id=?", strArr) + O0.delete("upload_queue", "app_id=?", strArr);
                    u4e u4eVar = (u4e) t4e.b.a.a;
                    if (lteVar.d.i0(null, yme.c1)) {
                        delete += O0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + O0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        ppe ppeVar = lteVar.f;
                        lte.m(ppeVar);
                        ppeVar.J.g(str2, Integer.valueOf(delete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e2) {
                    ppe ppeVar2 = lteVar.f;
                    lte.m(ppeVar2);
                    ppeVar2.f.g(ppe.f0(str2), e2, "Error resetting analytics data. appId, error");
                }
                if (d8fVar.D) {
                    a6fVar3.Z(d8fVar);
                    return;
                }
                return;
            case 4:
                mveVar.a.W();
                a6f a6fVar4 = mveVar.a;
                a6fVar4.f().W();
                a6fVar4.m0();
                am8.p(d8fVar.a);
                a6fVar4.n0(d8fVar);
                a6fVar4.o0(d8fVar);
                return;
            case 5:
                a6f a6fVar5 = mveVar.a;
                a6fVar5.W();
                a6fVar5.o0(d8fVar);
                return;
            default:
                a6f a6fVar6 = mveVar.a;
                a6fVar6.W();
                a6fVar6.n0(d8fVar);
                return;
        }
    }
}
