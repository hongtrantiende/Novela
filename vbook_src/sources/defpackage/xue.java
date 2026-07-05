package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xue  reason: default package */
/* loaded from: classes.dex */
public final class xue implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8f b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ mve d;

    public /* synthetic */ xue(mve mveVar, d8f d8fVar, Bundle bundle, int i) {
        this.a = i;
        this.b = d8fVar;
        this.c = bundle;
        this.d = mveVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        d8f d8fVar = this.b;
        mve mveVar = this.d;
        switch (i) {
            case 0:
                mveVar.a.W();
                return mveVar.a.e0(bundle, d8fVar);
            default:
                mveVar.a.W();
                return mveVar.a.e0(bundle, d8fVar);
        }
    }
}
