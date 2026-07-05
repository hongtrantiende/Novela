package org.mozilla.javascript.commonjs.module.provider;

import java.net.URI;
import java.util.ArrayList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.ModuleScriptProvider;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class MultiModuleScriptProvider implements ModuleScriptProvider {
    private final ModuleScriptProvider[] providers;

    public MultiModuleScriptProvider(Iterable<? extends ModuleScriptProvider> iterable) {
        ArrayList arrayList = new ArrayList();
        for (ModuleScriptProvider moduleScriptProvider : iterable) {
            arrayList.add(moduleScriptProvider);
        }
        this.providers = (ModuleScriptProvider[]) arrayList.toArray(new ModuleScriptProvider[0]);
    }

    @Override // org.mozilla.javascript.commonjs.module.ModuleScriptProvider
    public ModuleScript getModuleScript(Context context, String str, URI uri, URI uri2, Scriptable scriptable) {
        ModuleScriptProvider[] moduleScriptProviderArr = this.providers;
        int length = moduleScriptProviderArr.length;
        int i = 0;
        while (i < length) {
            Context context2 = context;
            String str2 = str;
            URI uri3 = uri;
            URI uri4 = uri2;
            Scriptable scriptable2 = scriptable;
            ModuleScript moduleScript = moduleScriptProviderArr[i].getModuleScript(context2, str2, uri3, uri4, scriptable2);
            if (moduleScript != null) {
                return moduleScript;
            }
            i++;
            context = context2;
            str = str2;
            uri = uri3;
            uri2 = uri4;
            scriptable = scriptable2;
        }
        return null;
    }
}
