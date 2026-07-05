package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ly7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly7 implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ ly7(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object js_valueOf;
        Object lambda$addSymbolSpecies$0;
        switch (this.a) {
            case 0:
                js_valueOf = NativeSymbol.js_valueOf(context, scriptable, scriptable2, objArr);
                return js_valueOf;
            default:
                lambda$addSymbolSpecies$0 = ScriptRuntimeES6.lambda$addSymbolSpecies$0(context, scriptable, scriptable2, objArr);
                return lambda$addSymbolSpecies$0;
        }
    }
}
