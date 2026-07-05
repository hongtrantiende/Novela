package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uae  reason: default package */
/* loaded from: classes.dex */
public final class uae implements abe {
    public final /* synthetic */ int a;
    public final odd b;
    public final String c;

    public /* synthetic */ uae(odd oddVar, String str, int i) {
        this.a = i;
        this.b = oddVar;
        this.c = str;
    }

    @Override // defpackage.abe
    public final odd f(e9e e9eVar) {
        int i = this.a;
        String str = this.c;
        odd oddVar = this.b;
        switch (i) {
            case 0:
                odd v = oddVar.v();
                v.A(str, e9eVar);
                ((HashMap) v.e).put(str, Boolean.TRUE);
                return v;
            default:
                oddVar.A(str, e9eVar);
                return oddVar;
        }
    }
}
