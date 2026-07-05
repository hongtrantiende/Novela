package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: km  reason: default package */
/* loaded from: classes.dex */
public final class km {
    public boolean f;
    public final km h;
    public final /* synthetic */ mm i;
    public final long a = Thread.currentThread().getId();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public boolean g = true;

    public km(mm mmVar, km kmVar) {
        this.i = mmVar;
        this.h = kmVar;
    }

    public final void a() {
        boolean z;
        if (this.a == Thread.currentThread().getId()) {
            if (this.f && this.g) {
                z = true;
            } else {
                z = false;
            }
            mm mmVar = this.i;
            km kmVar = this.h;
            if (kmVar == null) {
                if (z) {
                    mmVar.Q().j0();
                    mmVar.Q().G();
                } else {
                    mmVar.Q().G();
                }
            }
            mmVar.b.set(kmVar);
            uf9.a.getClass();
            return;
        }
        vs.k("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
    }
}
