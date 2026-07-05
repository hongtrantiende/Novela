package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m2f  reason: default package */
/* loaded from: classes.dex */
public final class m2f extends l5e {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2f(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.l5e
    public final e9e g(odd oddVar, List list) {
        int i = this.c;
        r9e r9eVar = e9e.u;
        switch (i) {
            case 0:
                return r9eVar;
            case 1:
            case 2:
                return this;
            case 3:
                return new g4e(Double.valueOf(0.0d));
            default:
                return r9eVar;
        }
    }
}
