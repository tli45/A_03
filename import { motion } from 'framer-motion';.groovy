import { motion } from 'framer-motion';
import { useEffect } from 'react';

const sections = [
  {
    title: "滑板 Ollie 是什么？",
    subtitle: "滑板起跳动作的核心技术",
    bg: "bg-gradient-to-b from-black via-gray-900 to-gray-800",
  },
  {
    title: "动作分解图解",
    subtitle: "了解 Pop、Slide 与 Lift 的配合",
    bg: "bg-gradient-to-b from-indigo-900 via-purple-900 to-black",
  },
  {
    title: "起跳背后的物理原理",
    subtitle: "力、摩擦与旋转 —— 理解 Ollie 的科学",
    bg: "bg-gradient-to-b from-blue-900 via-sky-800 to-cyan-700",
  },
];

export default function OllieLandingPage() {
  useEffect(() => {
    window.scrollTo(0, 0);
  }, []);

  return (
    <div className="scroll-smooth text-white font-sans">
      {sections.map((section, index) => (
        <section
          key={index}
          className={`min-h-screen flex flex-col items-center justify-center px-8 text-center ${section.bg}`}
        >
          <motion.h1
            className="text-4xl md:text-6xl font-bold mb-4"
            initial={{ opacity: 0, y: 50 }}
            whileInView={{ opacity: 1, y: 0 }}
            transition={{ duration: 1 }}
          >
            {section.title}
          </motion.h1>

          <motion.p
            className="text-lg md:text-2xl max-w-xl"
            initial={{ opacity: 0, y: 50 }}
            whileInView={{ opacity: 1, y: 0 }}
            transition={{ duration: 1.2, delay: 0.2 }}
          >
            {section.subtitle}
          </motion.p>
        </section>
      ))}
    </div>
  );
}
