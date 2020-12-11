﻿using Microsoft.Graph.ODataTemplateWriter.Settings;
using NUnit.Framework;

namespace Typewriter.Test
{
    [TestFixture]
    public class CSharpMultipleNamespacesTests
    {
        [SetUp]
        public void Setup()
        {
            ConfigurationService.ResetSettings();
        }
        [Test]
        public void Test()
        {
            MultipleNamespacesTestRunner.Run(TestLanguage.CSharp);
        }
    }
}
