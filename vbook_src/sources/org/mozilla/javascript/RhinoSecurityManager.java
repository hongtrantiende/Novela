package org.mozilla.javascript;

import org.mozilla.javascript.PolicySecurityController;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class RhinoSecurityManager extends SecurityManager {
    public Class<?> getCurrentScriptClass() {
        Class<?>[] classContext;
        for (Class<?> cls : getClassContext()) {
            if ((cls != InterpretedFunction.class && NativeFunction.class.isAssignableFrom(cls)) || PolicySecurityController.SecureCaller.class.isAssignableFrom(cls)) {
                return cls;
            }
        }
        return null;
    }
}
