package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeRegExpInstantiator {
    private NativeRegExpInstantiator() {
    }

    public static NativeRegExp withLanguageVersion(int i) {
        if (i < 200) {
            return new NativeRegExpCallable();
        }
        return new NativeRegExp();
    }

    public static NativeRegExp withLanguageVersionScopeCompiled(int i, Scriptable scriptable, RECompiled rECompiled) {
        if (i < 200) {
            return new NativeRegExpCallable(scriptable, rECompiled);
        }
        return new NativeRegExp(scriptable, rECompiled);
    }
}
