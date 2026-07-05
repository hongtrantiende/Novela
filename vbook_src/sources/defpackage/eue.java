package defpackage;

import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eue  reason: default package */
/* loaded from: classes.dex */
public final class eue implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ mve e;

    public /* synthetic */ eue(mve mveVar, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mveVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        mve mveVar = this.e;
        switch (i) {
            case 0:
                mveVar.a.W();
                z9e z9eVar = mveVar.a.c;
                a6f.U(z9eVar);
                return z9eVar.V0(str3, str2, str);
            case 1:
                mveVar.a.W();
                z9e z9eVar2 = mveVar.a.c;
                a6f.U(z9eVar2);
                return z9eVar2.V0(str3, str2, str);
            case 2:
                mveVar.a.W();
                z9e z9eVar3 = mveVar.a.c;
                a6f.U(z9eVar3);
                return z9eVar3.Z0(str3, str2, str);
            default:
                mveVar.a.W();
                z9e z9eVar4 = mveVar.a.c;
                a6f.U(z9eVar4);
                return z9eVar4.Z0(str3, str2, str);
        }
    }
}
