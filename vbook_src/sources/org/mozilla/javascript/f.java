package org.mozilla.javascript;

import java.lang.reflect.Method;
import java.util.function.BiFunction;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Method moreConcreteMethod;
        moreConcreteMethod = JavaMembers.getMoreConcreteMethod((Method) obj, (Method) obj2);
        return moreConcreteMethod;
    }
}
