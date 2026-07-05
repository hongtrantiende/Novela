package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qud  reason: default package */
/* loaded from: classes.dex */
public final class qud {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final tz4 a;

    public qud(tz4 tz4Var) {
        this.a = tz4Var;
    }

    public final nwd a(nwd nwdVar) {
        boolean z = true;
        if (!nwdVar.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        nwdVar.i = z;
        tz4 tz4Var = this.a;
        yz4 yz4Var = tz4Var.k;
        yz4Var.getClass();
        vud vudVar = new vud(new bvd(nwdVar), yz4Var.E.get(), tz4Var);
        ovd ovdVar = yz4Var.J;
        ovdVar.sendMessage(ovdVar.obtainMessage(4, vudVar));
        return nwdVar;
    }
}
