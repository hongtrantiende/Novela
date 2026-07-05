package defpackage;

import java.util.Map;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v3a  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3a implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3a b;

    public /* synthetic */ v3a(w3a w3aVar, int i) {
        this.a = i;
        this.b = w3aVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        w3a w3aVar = this.b;
        hi1 hi1Var = (hi1) obj;
        switch (i) {
            case 0:
                hi1Var.getClass();
                hi1Var.a("type", c4b.b);
                hi1Var.a(ES6Iterator.VALUE_PROPERTY, aze.n("kotlinx.serialization.Sealed<" + w3aVar.a.g() + '>', s9a.f, new o9a[0], new v3a(w3aVar, 1)));
                hi1Var.b = ks3.a;
                return pvcVar;
            default:
                hi1Var.getClass();
                for (Map.Entry entry : w3aVar.d.entrySet()) {
                    hi1Var.a((String) entry.getKey(), ((s76) entry.getValue()).e());
                }
                return pvcVar;
        }
    }
}
