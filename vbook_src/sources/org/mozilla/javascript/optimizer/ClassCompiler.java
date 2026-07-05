package org.mozilla.javascript.optimizer;

import java.util.HashMap;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.IRFactory;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ScriptNode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ClassCompiler {
    private CompilerEnvirons compilerEnv;
    private String mainMethodClassName;
    private Class<?> targetExtends;
    private Class<?>[] targetImplements;

    public ClassCompiler(CompilerEnvirons compilerEnvirons) {
        if (compilerEnvirons != null) {
            this.compilerEnv = compilerEnvirons;
            this.mainMethodClassName = "org.mozilla.javascript.optimizer.OptRuntime";
            return;
        }
        p1a.g();
        throw null;
    }

    public Object[] compileToClassFiles(String str, String str2, int i, String str3) {
        boolean z;
        String makeAuxiliaryClassName;
        ScriptNode transformTree = new IRFactory(this.compilerEnv, str).transformTree(new Parser(this.compilerEnv).parse(str, str2, i));
        if (this.compilerEnv.isGeneratingSource()) {
            transformTree.setRawSource(str);
            transformTree.setRawSourceBounds(0, str.length());
        }
        Class<?> targetExtends = getTargetExtends();
        Class<?>[] targetImplements = getTargetImplements();
        if (targetImplements == null && targetExtends == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            makeAuxiliaryClassName = str3;
        } else {
            makeAuxiliaryClassName = makeAuxiliaryClassName(str3, "1");
        }
        Codegen codegen = new Codegen();
        codegen.setMainMethodClass(this.mainMethodClassName);
        byte[] compileToClassFile = codegen.compileToClassFile(this.compilerEnv, makeAuxiliaryClassName, transformTree, str, false);
        if (z) {
            return new Object[]{makeAuxiliaryClassName, compileToClassFile};
        }
        int functionCount = transformTree.getFunctionCount();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 != functionCount; i2++) {
            FunctionNode functionNode = transformTree.getFunctionNode(i2);
            String name = functionNode.getName();
            if (name != null && name.length() != 0) {
                hashMap.put(name, Integer.valueOf(functionNode.getParamCount()));
            }
        }
        if (targetExtends == null) {
            targetExtends = ScriptRuntime.ObjectClass;
        }
        return new Object[]{str3, JavaAdapter.createAdapterCode(hashMap, str3, targetExtends, targetImplements, makeAuxiliaryClassName), makeAuxiliaryClassName, compileToClassFile};
    }

    public CompilerEnvirons getCompilerEnv() {
        return this.compilerEnv;
    }

    public String getMainMethodClass() {
        return this.mainMethodClassName;
    }

    public Class<?> getTargetExtends() {
        return this.targetExtends;
    }

    public Class<?>[] getTargetImplements() {
        Class<?>[] clsArr = this.targetImplements;
        if (clsArr == null) {
            return null;
        }
        return (Class[]) clsArr.clone();
    }

    public String makeAuxiliaryClassName(String str, String str2) {
        return nk2.u(str, str2);
    }

    public void setMainMethodClass(String str) {
        this.mainMethodClassName = str;
    }

    public void setTargetExtends(Class<?> cls) {
        this.targetExtends = cls;
    }

    public void setTargetImplements(Class<?>[] clsArr) {
        Class<?>[] clsArr2;
        if (clsArr == null) {
            clsArr2 = null;
        } else {
            clsArr2 = (Class[]) clsArr.clone();
        }
        this.targetImplements = clsArr2;
    }
}
