package org.mozilla.javascript;

import org.mozilla.javascript.NativePromise;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativePromise.Reaction b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Scriptable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(NativePromise.Reaction reaction, Context context, Scriptable scriptable, Object obj, int i) {
        this.a = i;
        this.b = reaction;
        this.c = context;
        this.d = scriptable;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Scriptable scriptable = this.d;
        Context context = this.c;
        NativePromise.Reaction reaction = this.b;
        switch (i) {
            case 0:
                reaction.invoke(context, scriptable, obj);
                return;
            default:
                reaction.invoke(context, scriptable, obj);
                return;
        }
    }
}
