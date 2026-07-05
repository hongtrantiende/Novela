package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: te6  reason: default package */
/* loaded from: classes.dex */
public final class te6 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te6(Context context, String str, int i) {
        super(0);
        this.a = i;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        String str = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                return bbe.o(context, str);
            default:
                return sxd.m(context, str);
        }
    }
}
